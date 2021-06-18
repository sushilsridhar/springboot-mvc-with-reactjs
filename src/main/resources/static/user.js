$(document).ready(function() {
    $.ajax({
        url: "http://127.0.0.1:8080/springboot-mvc-with-reactjs/user"
    }).then(function(data) {
        $('.firstname').append(data.firstName);
        $('.lastname').append(data.lastName);
        $('.age').append(data.age);
    });
});