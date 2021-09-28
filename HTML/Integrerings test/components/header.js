class Header extends HTMLElement {
    constructor() {
      super();
    }
  
    connectedCallback() {
      this.innerHTML = `
      <header>
      <h1>Heisann!</h1>
      <p>Da e sjukt kjekt om detta funke</p>
      </header>
      `;
    }
  }
  
  customElements.define('top-bar', Header);