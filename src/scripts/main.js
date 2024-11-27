// Lógica de búsqueda
const sectorInput = document.getElementById('sector');
const tipoInmuebleSelect = document.getElementById('tipo-inmueble');
const presupuestoSelect = document.getElementById('presupuesto');
const searchButton = document.querySelector('.search-button');

searchButton.addEventListener('click', () => {
    const sector = sectorInput.value;
    const tipoInmueble = tipoInmuebleSelect.value;
    const presupuesto = presupuestoSelect.value;

    // Aquí puedes agregar la lógica para la búsqueda
    console.log(`Sector: ${sector}, Tipo de inmueble: ${tipoInmueble}, Presupuesto: ${presupuesto}`);
});