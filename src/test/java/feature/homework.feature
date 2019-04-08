Feature:Access Website
  Scenario: Access google chrome
    Given I am a Google chrome user
    When I access Booking website
    Then I see booking.com webpage
