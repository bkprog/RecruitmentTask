Zadanie 1.

Stworzyłem abstrakcyjną klasę Tree, która zawiera pola i metody wspólne dla drzew iglastych oraz liściastych.
Klasa DeciduousTree dziedziczy po klasie Tree oraz dodatkowo ma metodę do zrzucania liści- dropLeaves().
Klasa ConiferousTree dziedziczy po klasie Tree oraz dodatkowo ma metodę do robienia szyszek- makeCones().

Zadanie 2.
Stworzyłem encję, która zawiera pola geolocationLogId, deviceId, latitude oraz longitude. 
Istnieje tam również statyczna metoda of(), która służy do tworzenie obiektu encji na podstawie obiektu DTO za pomocą buildera.
Do rozwiązania użyłem bazy danych h2.
Do zapisywania danych do bazy danych używam Spring Data JPA.
Stworzyłem także Serwis, w którym używam repozytorium do zapisania danych do bazy, oraz Controller który przyjmuje dane oraz przekazuje je do serwisu.
Dla serwisu i controllera napisałem testy jednostkowe.

Jeśli chodzi o obsługę logowania to nie do końca rozumiem co autor zadania miał na myśli mówiąc obsługa logowania.
Może chodzić o standardową autentykację typu login hasło lub ewentualnie o użycie loggera typu SLF4J, dlatego ten punkt pominąłem.

Podobnie z walidacją parametrów, nie widzę kryterium pod jakim miałbym je walidować skoro parametry to 3 liczby, z których jedna to id urządzenia,
a pozostałe to koordynaty które mogą być ujemne.


