# Filtro Spring Boot

* **Tabla seleccionada** -> farmacy

  * **GET**

    ```
    http://localhost:8080/farmacies
    ```

  * **GET/ID**

    ```
    http://localhost:8080/farmacies/1
    ```

  * **POST**

    ```
    http://localhost:8080/farmacies
    ```

    Body de la solicitud:

    ```
    {
    	"namefarmacy": "Drogas La Rebaja",
    	"addressfarmacy": "Clle 36",
    	"long1": 2,
    	"latfarmacy": 2,
    	"codecityfarm": "BOG",
    	"logofarmacy": "Rebaja"
    }
    ```

  * **PUT**

    ```
    http://localhost:8080/farmacies/4
    ```

    Body de la solicitud:

    ```
    {
    	"namefarmacy": "Drogas La Rebaja",
    	"addressfarmacy": "CRA 36",
    	"long1": 266,
    	"latfarmacy": 2,
    	"codecityfarm": "BOG",
    	"logofarmacy": "Rebaja"
    }
    ```

  * **DELETE**

    ```
    http://localhost:8080/farmacies/1
    ```

    