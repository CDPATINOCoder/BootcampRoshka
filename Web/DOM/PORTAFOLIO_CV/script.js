(() => {
  const btnMenu = document.querySelector(".menu-btn");
  const menu = document.querySelector(".menu");
  btnMenu.addEventListener("click", () => {
    btnMenu.firstElementChild.classList.toggle("none");
    btnMenu.lastElementChild.classList.toggle("none");
    menu.classList.toggle("is-active");
  });

  document.addEventListener("click", (event) => {
    if (!event.target.matches(".menu a")) return false;

    btnMenu.firstElementChild.classList.remove("none");
    btnMenu.lastElementChild.classList.add("none");
    menu.classList.remove("is-active");
  });
})();
