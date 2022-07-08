package hw13;

public class DynamicXpath {
/*
 * Tag with a single attribute.For examples:
 * Bestbuy --> //input[@id='gh-search-input']
 * Amazon --> //input[@id='twotabsearchtextbox']
 * Walmart --> //input[@class='b--none f5 flex-auto lh-solid sans-serif br-pill']
 * Apple --> //input[@id='ac-gn-searchform-input']
 * Youtube --> //input[@class='ytd-searchbox']
 */
	
/*
 * Tag with multiple attribute with 'and' logic. For examples:
 * Bestbuy --> //input[@id='gh-search-input' and @type='text']
 * Amazon --> //input[@id='twotabsearchtextbox' and @type='text']
 * Walmart --> //input[@class='b--none f5 flex-auto lh-solid sans-serif br-pill' and @type='search']
 * Apple --> //input[@id='ac-gn-searchform-input'and @type='text']
 * Youtube --> //input[@class='ytd-searchbox'and @id='search']
 */
	
/*
 * Tag with inner text [complere text].For examples:
 * Bestbuy -->//a[text()='Top Deals']
 * Amazon --> //a[text()='Gift Cards']
 * Walmart --> //a[text()='Departments']
 * Apple --> //a[text()='iPhone']
 * Ebay --> //a[@id='gh-btn' and text()='Search']
 */

/*
 * Tag with inner text [not complete inner text rather partial text as well as actual text].For examples:
 * Bestbuy --> //a[contains(text(), 'Totaltech ')]
 * Amazon --> //a[contains(text(), 'Kindle B')]
 * Walmart --> //a[contains(text(), 'Cooling &')]
 * Apple --> //a[contains(text(), 'TV &')]
 * Ebay --> //a[contains(text(), 'All Categ')]
 */
	
/*
 * Normalize space -- eliminates leading and trailing spaces.For examples:
 * EnthrallIT --> //label[normalize-space(text())='Female']
 * EnthrallIT --> //label[normalize-space(text())='Male']
 * Mount Sinai --> //a[normalize-space(text())='Our Locations' and @role='button']
 * Mount Sinai --> //a[normalize-space(text())='About Us' and @role='button'
 */
	
/*
 * Starts with text.For examples:
 * Bestbuy -->//a[starts-with(text(), 'Healt')]
 * Amazon --> //a[starts-with(text(), 'Amazon Bas')]
 * Walmart --> //a[starts-with(text(), 'Fa')]
 * Apple --> //a[starts-with(text(), 'TV')]
 * Ebay --> //a[starts-with(text(), 'Sav')]
 */
	
/*
 * Tag with parents.For examples:
 * Bestbuy --> //a[text()='Health & Wellness']//parent::li
 * Amazon --> //a[text()='Amazon Home']//parent::div
 * Walmart --> //a[text()='Tech']//parent::div
 * Apple --> //a[text()='Watch']//parent::li
 * Ebay --> //a[text()='Toys']//parent::li
 */
	
/*
 * Tag with following sibling {younger brother}.For examples:
 * Bestbuy -->//input[@type='hidden']//following-sibling::input[@id='search-session-id']
 * Amazon --> //option[@value='search-alias=aps']//following-sibling::option[@value='search-alias=alexa-skills']
 * Walmart --> //a[@class='white no-underline highlight-focus-hover ph2']//following-sibling::a[text()='Tech']
 * Ebay --> //option[@value='550']//following-sibling::option[text()='Baby']
 * CMS.gov --> //label[@for='checkd']//following-sibling::input[@id='checkd'] 
 */
	
/*
 * Tag with preceding sibling {elder brother}
 * Bestbuy --> //input[@id='search-session-id']//preceding-sibling::input[@type='hidden']
 * Amazon --> //option[@value='search-alias=alexa-skills']//preceding-sibling::option[@value='search-alias=aps']
 * Walmart --> //a[text()='Tech']//preceding-sibling::a[@class='white no-underline highlight-focus-hover ph2']
 * Ebay --> //option[text()='Baby']//preceding-sibling::option[@value='550']
 * CMS.gov --> //input[@id='checkd']//preceding-sibling::label[@for='checkd']
 */
	
}
