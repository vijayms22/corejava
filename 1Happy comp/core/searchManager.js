//Core Search Functionality implemented by the Search Manager
import { SearchAPI } from "../services/searchService.js";
import { Airport, City } from "../models/happyTripModels.js";

class SearchManager {
  //Dependency Injection (SearchService)

  //Configurable Limits for Adults
  ADULT_LIMIT = 9;
  CHILDREN_LIMIT = 9;
  INFANTS_LIMIT = 5;

  constructor() {
    // console.log(SearchAPI.getAirports())
    let searchApi = new SearchAPI();
  }

  searchFlights = async function (searchInfo) {
    //Make a call to the Search Service to get the Search Results
    let searchApi = new SearchAPI();
    //Return the Collection of Search Results (Flight Schedules)
    let flightlist = await searchApi.searchFlights();
    console.log(flightlist);
    // Return the airports
    return flightlist;
  };

  getAirports = async function () {
    let searchApi = new SearchAPI();
    //Call to api to get the airports from backend

    let airports = await searchApi.getAirports();
    console.log(airports);

    // Return the airports
    return airports;
  };

  getTravelClasses = async function () {
    let searchApi = new SearchAPI();
    //Call to api to get the travel classes from backend
    let travelClasses = await searchApi.getTravelClasses();
    console.log(travelClasses);
    //Return the Collection of Travel Classes
    return travelClasses;
  };

  getAdultLimit = function () {
    let ADULT_LIMIT = [];
    for (let i = 0; i <= ADULT_LIMIT; i++) {
      ADULT_LIMIT.push(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    // console.log(ADULT_LIMIT)
    return ADULT_LIMIT;
  };

  getChildrenLimit = function () {
    let CHILDREN_LIMIT = [];
    for (let i = 0; i <= CHILDREN_LIMIT; i++) {
      CHILDREN_LIMIT.push(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    // console.log(CHILDREN_LIMIT)
    return CHILDREN_LIMIT;
  };

  getInfantsLimit = function () {
    let INFANTS_LIMIT = [];
    for (let i = 0; i <= INFANTS_LIMIT; i++) {
      INFANTS_LIMIT.push(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    // console.log(INFANTS_LIMIT)
    return INFANTS_LIMIT;
  };

  getDefaultTravelDirection = function () {
    let DEFAULT_TRAVEL_DIRECTION = "OneWay";

    return DEFAULT_TRAVEL_DIRECTION;
  };

  setSearchInfo = function (searchInfo) {
    //Store the search information locally for data to be accessed across components
    localStorage.setItem("searchInfo", JSON.stringify(searchInfo));
  };
}

export { SearchManager };
