Feature: Wikipedia search functionality and verification

Scenario Outline: Wikipedia Search Functionality Title Verification
Then user navigate to "<searchValue>"


Examples: search values we are going to be using in this scenario is as below
  | searchValue                                                              |
  | https://turkeyoutdoor.org/hakkimizda/                                    |
  | https://turkeyoutdoor.org/outdoor/                                       |
  | https://turkeyoutdoor.org/gezi-rehberi/                                  |
  | https://turkeyoutdoor.org/outdoor-turizmi/                               |
  | https://turkeyoutdoor.org/dogayi-koruyalim/                              |
  | https://turkeyoutdoor.org/contact/                                       |
  | https://turkeyoutdoor.org/community/                                     |
  | https://turkeyoutdoor.org/                                               |
  | https://turkeyoutdoor.org/                                               |
  | https://turkeyoutdoor.org/#                                              |
  | https://turkeyoutdoor.org/hakkimizda/                                    |
  | https://turkeyoutdoor.org/outdoor/                                       |
  | https://turkeyoutdoor.org/category/outdoor-aktiviteleri/                 |
  | https://turkeyoutdoor.org/category/doga-yuruyusleri/                     |
  | https://turkeyoutdoor.org/category/kampcilik/                            |
  | https://turkeyoutdoor.org/category/dagcilik/                             |
  | https://turkeyoutdoor.org/category/outdoor-aktiviteleri/ekstrem-sporlar/ |
  | https://turkeyoutdoor.org/category/outdoor-yazilari/                     |
  | https://turkeyoutdoor.org/category/gezi-rehberi/                         |
  | https://turkeyoutdoor.org/category/alinti-yazilar/                       |
  | https://turkeyoutdoor.org/category/outdoor-haber/                        |
  | https://turkeyoutdoor.org/category/giyim-ekipman-applikasyon/            |
  | https://turkeyoutdoor.org/gezi-rehberi/                                  |
  | https://turkeyoutdoor.org/gezi-rehberi/adana-gezi-rehberi-2/             |
  | https://turkeyoutdoor.org/gezi-rehberi/02-adiyaman-gezi-rehberi/         |
