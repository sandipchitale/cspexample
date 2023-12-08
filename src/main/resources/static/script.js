(async () => {
    document.addEventListener('DOMContentLoaded', async () => {
        const metacsp = document.querySelector('html head meta:nth-child(3)');

        const csp = document.getElementById('csp');
        csp.innerText = metacsp.getAttribute('content');

        const diditwork = document.getElementById('diditwork');
        diditwork.innerText = 'Worked!';
    });
})();