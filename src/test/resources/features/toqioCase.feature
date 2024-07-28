@toqioCase
Feature:As a user I should be able to browse into Toqio pages

  Background:
    Given User is on Toqio homepages

  @teamMembers
  Scenario: Menu Options
    When user clicks on company tab and team sub menu
    Then the user should be able to see following team members

      | Eduardo Martínez          |
      | Mike Galvin               |
      | Arancha Riestra           |
      | Michael Pierce            |
      | Kunal Galav               |
      | Daniella Rhodes           |
      | Rodrigo Iglesias          |
      | Jessica Armada            |
      | Gabriel de Montessus      |
      | Aristotelis Xenofontos    |
      | Enrique Martinez Hausmann |
      | Jay Wilson                |
      | Yin Yan                   |
      | Beatriz Gonzalez          |
      | Joerg Floeck              |

  @languages
  Scenario: User should be able to do the transition between english to spanish
    When the user selects Spanish as a language
    Then the user should be able to verify the url "https://toqio.co/es/"

