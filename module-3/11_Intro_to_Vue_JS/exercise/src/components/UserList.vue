<template>
  <table id="tblUsers">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td><input type="text" id="firstNameFilter" v-model="search.firstName"/></td>
        <td><input type="text" id="lastNameFilter" v-model="search.lastName"/></td>
        <td><input type="text" id="usernameFilter" v-model="search.username"/></td>
        <td><input type="text" id="emailFilter" v-model="search.emailAddress"/></td>
        <td>
          <select id="statusFilter" v-model="search.status">
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Inactive">Inactive</option>
          </select>
        </td>
      </tr>
      <!-- user listing goes here -->
      <tr class="user" v-for="(user, index) in filteredList" v-bind:key="index" :class="{inactive: user.status === 'Inactive'}">
        <td class="firstName">{{ user.firstName }}</td>
        <td class="lastName">{{ user.lastName }}</td>
        <td class="username">{{ user.username }}</td>
        <td class="emailAddress">{{ user.emailAddress }}</td>
        <td class="status">{{ user.status }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: 'user-list',
  data() {
    return {
      
      search:{
        firstName: "",
        lastName: "",
        username: "",
        emailAddress:"",
        status: ""
      },
      
      users: [
        { firstName: 'John', lastName: 'Smith', username: 'jsmith', emailAddress: 'jsmith@gmail.com', status: 'Active' },
        { firstName: 'Anna', lastName: 'Bell', username: 'abell', emailAddress: 'abell@yahoo.com', status: 'Active' },
        { firstName: 'George', lastName: 'Best', username: 'gbest', emailAddress: 'gbest@gmail.com', status: 'Inactive' },
        { firstName: 'Ben', lastName: 'Carter', username: 'bcarter', emailAddress: 'bcarter@gmail.com', status: 'Active' },
        { firstName: 'Katie', lastName: 'Jackson', username: 'kjackson', emailAddress: 'kjackson@yahoo.com', status: 'Active' },
        { firstName: 'Mark', lastName: 'Smith', username: 'msmith', emailAddress: 'msmith@foo.com', status: 'Inactive' }
      ]
    }
    
  },
  computed:{
    filteredList() {
      let filteredUser = this.users;
      if(this.search.firstName !="") {
        filteredUser = filteredUser.filter((user) =>
          user.firstName
          .toLowerCase()
          .includes(this.search.firstName.toLowerCase())
        );
      }
      if (this.search.lastName != "") {
        filteredUser = filteredUser.filter((user) =>
          user.lastName
            .toLowerCase()
            .includes(this.search.lastName.toLowerCase())
        );
      }
      if (this.search.username != "") {
        filteredUser = filteredUser.filter((user) =>
          user.username
            .toLowerCase()
            .includes(this.search.username.toLowerCase())
        );
      }
      if (this.search.emailAddress != "") {
        filteredUser = filteredUser.filter((user) =>
          user.emailAddress
            .toLowerCase()
            .includes(this.search.emailAddress.toLowerCase())
        );
      }
      if (this.search.status != "") {
        filteredUser = filteredUser.filter((user) =>
          user.status === this.search.status
        );
      }
      
      return filteredUser
    }
   

    
  }
  
}
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif
}
th {
  text-transform: uppercase
}
td {
  padding: 10px;
}
tr.inactive {
  color: red;
}
input, select {
  font-size: 16px;
}
</style>
