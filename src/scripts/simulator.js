function calculate() {
    const propertyValue = parseFloat(document.getElementById("propertyValue").value);
    const financeTerm = parseInt(document.getElementById("financeTerm").value);
    const monthlyInterest = 1.2 / 100; // 1.2% mensual
    const commissionRate = 5 / 100; // 5% comisión

    // Calcular el interés total
    const totalInterest = propertyValue * monthlyInterest * financeTerm;

    // Calcular la comisión de la inmobiliaria
    const commission = propertyValue * commissionRate;

    // Calcular el valor neto de la propiedad
    const netValue = propertyValue + totalInterest + commission;

    // Mostrar resultados
    document.getElementById("results").innerHTML = `
        Intereses Totales: $${totalInterest.toFixed(2)}<br>
        Comisión de la Inmobiliaria: $${commission.toFixed(2)}<br>
        Valor Neto de la Propiedad: $${netValue.toFixed(2)}
    `;
}