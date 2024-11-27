function formatNumber(input) {
    // Eliminar cualquier carácter que no sea un dígito
    let value = input.value.replace(/\D/g, '');

    // Agregar las comas de miles
    value = value.replace(/\B(?=(\d{3})+(?!\d))/g, ',');

    // Actualizar el valor del input
    input.value = value;
  }

  function calculateResults() {
    // Código de cálculo de resultados
    const propertyValue = parseFloat(document.getElementById("propertyValue").value.replace(/,/g, ''));
    const financeTerm = parseInt(document.getElementById("financeTerm").value);
    const monthlyInterestRate = 0.012; // 1.2% mensual
    const commissionRate = 0.05; // 5% comisión

    const totalInterest = propertyValue * monthlyInterestRate * financeTerm;
    const commission = propertyValue * commissionRate;
    const netValue = propertyValue + totalInterest + commission;

    // Actualizar los valores en la tabla
    const resultsTable = document.querySelector("table");
    resultsTable.rows[1].cells[1].textContent = formatNumberWithCommas(totalInterest.toFixed(0)); // Redondea el resultado sin decimales.
    resultsTable.rows[2].cells[1].textContent = formatNumberWithCommas(commission.toFixed(0));
    resultsTable.rows[3].cells[1].textContent = formatNumberWithCommas(netValue.toFixed(0));
  }

  function formatNumberWithCommas(value) {
    return value.replace(/\B(?=(\d{3})+(?!\d))/g, ',');
  }