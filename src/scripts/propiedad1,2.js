const carouselSlides = document.querySelectorAll('.carousel-slide');
const indicators = document.querySelectorAll('.indicator');
let currentIndex = 0;

function showSlide(index) {
  carouselSlides.forEach((slide, i) => {
    slide.classList.toggle('active', i === index);
  });
  indicators.forEach((indicator, i) => {
    indicator.classList.toggle('active', i === index);
  });
}

indicators.forEach((indicator, index) => {
  indicator.addEventListener('click', () => {
    currentIndex = index;
    showSlide(currentIndex);
  });
});

function autoSlide() {
  currentIndex = (currentIndex + 1) % carouselSlides.length;
  showSlide(currentIndex);
}

setInterval(autoSlide, 5000);
showSlide(currentIndex);