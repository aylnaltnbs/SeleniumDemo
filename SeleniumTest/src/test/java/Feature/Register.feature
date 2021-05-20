Feature: Getir Registering
  @register
  Scenario: User registers by successfully completing the registration form
    Given Start Driver and Browser
    When Navigate To testkalite URL
    And Iletısım menu click
    And Iletısım Form Filling
    And Gönder Button Click
    Then Success message check