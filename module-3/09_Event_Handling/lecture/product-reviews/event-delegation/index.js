const items = document.querySelectorAll("li");
items.forEach(item => {
  item.addEventListener("click", event => {
    console.log(item.innerText);
    event.target.style.backgroundColor = event.target.innerText;
  });
});


function addOrange() {
	const orange = document.createElement('li');
	orange.innerText = 'Orange';
	colors.appendChild(orange);
}



document.addEventListener('DOMContentLoaded', () => {
	const button = document.getElementById('btnAddOrange');
	button.addEventListener('click', addOrange);
});