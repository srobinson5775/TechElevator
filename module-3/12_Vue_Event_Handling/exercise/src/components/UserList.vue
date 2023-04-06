<template>
  <div class="container">
    <table id="tblUsers">
      <thead>
        <tr>
          <th>&nbsp;</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Username</th>
          <th>Email Address</th>
          <th>Status</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <input type="checkbox" id="selectAll" v-on:change="checkAll($event)" v-bind:checked="users.length == selectedUserIds.length"/>
          </td>
          <td>
            <input type="text" id="firstNameFilter" v-model="filter.firstName" />
          </td>
          <td>
            <input type="text" id="lastNameFilter" v-model="filter.lastName" />
          </td>
          <td>
            <input type="text" id="usernameFilter" v-model="filter.username" />
          </td>
          <td>
            <input type="text" id="emailFilter" v-model="filter.emailAddress" />
          </td>
          <td>
            <select id="statusFilter" v-model="filter.status">
              <option value>Show All</option>
              <option value="Active">Active</option>
              <option value="Inactive">Inactive</option>
            </select>
          </td>
          <td>&nbsp;</td>
        </tr>
        
        <tr
          v-for="user in users"
          v-bind:key="user.id"
          v-bind:class="{ deactivated: user.status === 'Inactive' }">
          <td>
            <input type="checkbox" v-model="selectedUserIds" v-bind:id="user.id" v-bind:value="user.id" />
          </td>
          <td>{{ user.firstName }}</td>
          <td>{{ user.lastName }}</td>
          <td>{{ user.username }}</td>
          <td>{{ user.emailAddress }}</td>
          <td>{{ user.status }}</td>
          <td>
            <button v-on:click="toggleStatus(user.id)" class="btnActivateDeactivate"> {{user.status === 'Active' ? 'Deactivate' : 'Activate'}} </button> 
          </td>
        </tr>
      </tbody>
    </table>

    <div class="all-actions">
      <button v-on:click="activateUsers" v-bind:disabled="!isBoxesChecked">Activate Users</button>
      <button v-on:click="deactivateUsers" v-bind:disabled="!isBoxesChecked">Deactivate Users</button>
      <button v-on:click="deleteUsers" v-bind:disabled="!isBoxesChecked">Delete Users</button>
    </div>

    <button v-on:click="showForm = !showForm">Add New User</button>

    <form id="frmAddNewUser" v-show="showForm" v-on:submit.prevent="addUser">
      <div class="field">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" v-model="newUser.firstName" />
      </div>
      <div class="field">
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" v-model="newUser.lastName " />
      </div>
      <div class="field">
        <label for="username">Username:</label>
        <input type="text" name="username" v-model="newUser.username" />
      </div>
      <div class="field">
        <label for="emailAddress">Email Address:</label>
        <input type="text" name="emailAddress" v-model="newUser.emailAddress" />
      </div>
      <button type="submit" class="btn save">Save User</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "user-list",
  data() {
    return {
      filter: {
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: ""
      },
      nextUserId: 7,
      newUser: {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active"
      },
      
      showForm: false,
      selectedUserIds: [],
      users: [
        {
          id: 1,
          firstName: "John",
          lastName: "Smith",
          username: "jsmith",
          emailAddress: "jsmith@gmail.com",
          status: "Active"
        },
        {
          id: 2,
          firstName: "Anna",
          lastName: "Bell",
          username: "abell",
          emailAddress: "abell@yahoo.com",
          status: "Active"
        },
        {
          id: 3,
          firstName: "George",
          lastName: "Best",
          username: "gbest",
          emailAddress: "gbest@gmail.com",
          status: "Inactive"
        },
        {
          id: 4,
          firstName: "Ben",
          lastName: "Carter",
          username: "bcarter",
          emailAddress: "bcarter@gmail.com",
          status: "Active"
        },
        {
          id: 5,
          firstName: "Katie",
          lastName: "Jackson",
          username: "kjackson",
          emailAddress: "kjackson@yahoo.com",
          status: "Active"
        },
        {
          id: 6,
          firstName: "Mark",
          lastName: "Smith",
          username: "msmith",
          emailAddress: "msmith@foo.com",
          status: "Inactive"
        }
      ]
    };
  },
  methods: {
    getNextUserId() {
      return this.nextUserId++;
    },
    addUser(){
      this.newUser.id= this.getNextUserId();
      this.users.push(this.newUser);
      this.resetForm();
      return this.newUser;
    },
    resetForm() {
      this.newUser = {}
    },

    activateUsers(){
      this.selectedUserIds.forEach((id) =>{
        this.users[this.findUserById(id)].status = "Active";
      });
      this.selectedUserIds = [];
    },
    deactivateUsers(){
      this.selectedUserIds.forEach((id) =>{
        this.users[this.findUserById(id)].status = "Inactive";
      });
      this.selectedUserIds = [];
    },
    deleteUsers(){
      this.selectedUserIds.forEach((id) =>{
        this.users = this.users.filter((user)=>{
          return user.id != id;
        });
      });
      this.selectedUserIds = [];
    },
    toggleStatus(id){
      let index = this.findUserById(id);
      this.users[index].status = this.users[index].status === "Active" ? "Inactive" : "Active";
    },
    findUserById(id){
      return this.users.findIndex((user) => user.id == id)
    },
    checkAll(event){
      if(event.target.checked){
        this.selectedUserIds = this.users.map(user => user.id);
      } else {
        this.selectedUserIds = [];
      }
    }
  },
  
  computed: {
    filteredList() {
      let filteredUsers = this.users;
      if (this.filter.firstName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.firstName
            .toLowerCase()
            .includes(this.filter.firstName.toLowerCase())
        );
      }
      if (this.filter.lastName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.lastName
            .toLowerCase()
            .includes(this.filter.lastName.toLowerCase())
        );
      }
      if (this.filter.username != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.username
            .toLowerCase()
            .includes(this.filter.username.toLowerCase())
        );
      }
      if (this.filter.emailAddress != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.emailAddress
            .toLowerCase()
            .includes(this.filter.emailAddress.toLowerCase())
        );
      }
      if (this.filter.status != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.status === this.filter.status
        );
      }
      return filteredUsers;
    },
    isBoxesChecked(){
      let numberOfChecked = this.selectedUserIds.length;
      return numberOfChecked > 0
    
    }
  }
}

</script>

<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  margin-bottom: 20px;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.deactivated {
  color: red;
}
input,
select {
  font-size: 16px;
}

form {
  margin: 20px;
  width: 350px;
}
.field {
  padding: 10px 0px;
}
label {
  width: 140px;
  display: inline-block;
}
button {
  margin-right: 5px;
}
.all-actions {
  margin-bottom: 40px;
}
.btn.save {
  margin: 20px;
  float: right;
}
</style>
