<%@ page contentType="text/html; charset=UTF-8"%> <%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head> </head>
<body>
  <div id="main">
    <form id="ticketingFrm" name="ticketingFrm" method="post">
      <table
        class="tg"
        height="190"
        width="1600"
        border="0"
        align="center"
        style="background: black"
      >
        <tr>
          <td class="tg-0lax" rowspan="3" width="100">
            <img id="printPoster" src="" width="100%" />
          </td>
          <td
            id="printMvNm"
            class="tg-0lax"
            width="300"
            height="75"
            style="font-size: 30; padding-left: 10; color: white"
          >
            영화
          </td>
          <td
            id="printTime"
            class="tg-0lax"
            width="300"
            height="75"
            style="font-size: 30; color: white"
          >
            일시:
          </td>
          <td class="tg-0lax" rowspan="3" width="150" align="center">
            <a href="javascript:submitToSelectSeat()"
              ><img src="https://ifh.cc/g/kgDpPx.png" width="150"
            /></a>
          </td>
        </tr>
        <tr>
          <td
            id="printMvDT"
            class="tg-0lax"
            width="300"
            style="padding-left: 10; color: white; font-size: 20"
          >
            영화제목
          </td>
          <td
            id="printScNm"
            class="tg-0lax"
            width="300"
            style="color: white; font-size: 20"
          >
            극장:
          </td>
        </tr>
        <tr>
          <td
            id="printMvAg"
            class="tg-0lax"
            width="300"
            style="padding-left: 10; color: white; font-size: 20"
          >
            영화
          </td>
          <td
            id="printThNm"
            class="tg-0lax"
            width="300"
            style="color: white; font-size: 20"
          >
            상영관:
          </td>
        </tr>
      </table>
      <table
        class="tg2"
        align="center"
        border="1"
        width="1600"
        height="640"
        style="background: lightyellow"
      >
        <thead>
          <tr style="background: slategray; color: lavender">
            <th class="tg-0lax" width="20%">영화</th>
            <th class="tg-0lax" width="30%">좌석필터</th>
            <th class="tg-0lax" width="30%">좌석현황</th>
            <th class="tg-0lax" width="20%">상영일시</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td class="tg-0lax" height="10%" align="center">
              <!-- 영화정렬선택 -->
              <select
                id="selectMovieSort"
                style="width: 30%"
                onchange="javascript:SelectMovieSort()"
              >
                <option selected="selected">최신순</option>
                <option selected="selected">평점순</option>
              </select>
              <input type="hidden" id="movieSort" name="movieSort" value="" />
            </td>
            <td class="tg-0lax" align="center">
              <!-- 좌석필터상영관선택 -->
              <select
                id="selectedFilterTheater"
                style="width: 20%"
                onchange="javascript:SelectFilterTheaterNum()"
              >
                <option value="" selected>관</option>
              </select>
              <input
                type="hidden"
                id="filterTheaterNum"
                name="filterTheaterNum"
                value=""
              />
            </td>
            <td
              class="tg-0lax"
              align="center"
              style="font-size: 18px; font-style: oblique"
            >
              상영관
            </td>
            <td class="tg-0lax">
              <!-- 날짜 선택 -->
              <table id="DateTable" width="100%">
                <tr>
                  <td colspan="7">
                    <div id="DateMonth" align="center">Month</div>
                  </td>
                </tr>
                <tr align="center">
                  <td>
                    <input
                      type="button"
                      disabled="disabled"
                      onclick="changeDatePage('0')"
                      value="<"
                    />
                  </td>

                  <td>
                    <div>
                      <input
                        type="button"
                        id="DateTd"
                        class="hover"
                        onclick="javascript:selectDate(0)"
                        style="
                          border: none;
                          width: 40;
                          background: black;
                          color: white;
                        "
                      />
                    </div>
                    <div id="WkdTd"></div>
                  </td>
                  <td>
                    <input
                      type="button"
                      disabled="disabled"
                      onclick="changeDatePage('2')"
                      value=">"
                    /><input
                      type="hidden"
                      id="dateIdx"
                      name="dateIdx"
                      value="1"
                    /><input
                      type="hidden"
                      id="datePage"
                      name="datePage"
                      value="1"
                    /><input
                      type="hidden"
                      id="printDate"
                      name="printDate"
                      value="1"
                    />
                  </td>
                </tr>
              </table>
            </td>
          </tr>
          <tr>
            <td class="tg-0lax" rowspan="2" height="40%">
              <!-- 영화목록 -->
              <div
                id="movieScroll"
                style="height: 100%; width: 100%; overflow: auto"
              >
                <table width="100%">
                  <tr>
                    <td class="rccl" style="background: lightgray">
                      <a
                        href="javascript:selectMovie('')"
                        class="noneUnderLine"
                      >
                        <img width="22" src="" />
                      </a>
                    </td>
                  </tr>
                </table>
                <p></p>

                <input type="hidden" id="sendMvIdx" name="movieIdx" value="0" />
              </div>
            </td>
            <td class="tg-0lax" rowspan="5" height="80%">
              <!-- 좌석필터배치도 -->
              <div
                align="center"
                style="margin: 2; padding: 2; overflow: auto; height: 100%"
              >
                <table style="border-style: solid">
                  <tr>
                    <td
                      colspan="17"
                      align="center"
                      style="background: white; color: black"
                    >
                      스크린
                    </td>
                  </tr>

                  <tr>
                    <td width="20">
                      <a
                        href="javascript:SelectFilterSeat('0')"
                        class="noneUnderLine"
                      >
                        <span class="material-symbols-outlined">chair</span>
                      </a>
                      <a
                        href="javascript:SelectFilterSeat('0')"
                        class="noneUnderLine"
                      >
                        <span
                          class="material-symbols-outlined"
                          style="font-variation-settings: 'FILL' 1"
                          >chair</span
                        >
                      </a>
                    </td>

                    <td width="20"></td>
                  </tr>
                </table>
                <table height="100%" align="center">
                  <tr>
                    <td>
                      <div align="center" style="vertical-align: middle">
                        <i class="bi bi-film" style="font-size: 30"></i>
                        <br />조회 가능한 상영관이 없습니다.<br />조건을
                        변경해주세요.
                      </div>
                    </td>
                  </tr>
                </table>
                <input type="hidden" id="seatNum" name="seatNum" value="-1" />
              </div>
            </td>
            <td class="tg-0lax" rowspan="5">
              <!-- 좌석현황배치도 -->
              <iframe
                id="seatIframe"
                width="100%"
                height="100%"
                style="margin: 0px"
                src="/TicketingSeat"
              ></iframe>
            </td>
            <td id="minimovieNm" class="rccl" height="10%" align="center">
              <!-- 상영영화제목표시 -->
              <img id="testId" name="TestName" width="22" src="1" />영화
            </td>
          </tr>
          <tr>
            <td class="tg-0lax" rowspan="4">
              <!-- 상영관목록 -->
              <div style="height: 100%; width: 100%; overflow: auto">
                <p style="font-size: 22px">2D | 0관</p>

                <table
                  class="items"
                  border="1"
                  width="70"
                  onclick="selectTime('0','1','2')"
                >
                  <tr>
                    <td align="center" style="background: lightgray">
                      <div style="font-size: 10px">0관</div>
                      <div id="1" style="font: bold; font-size: 20px">
                        타임텍스트
                      </div>
                      <div style="font-size: 12px">0/1</div>
                    </td>
                  </tr>
                </table>

                <hr />

                <table height="100%" align="center">
                  <tr>
                    <td>
                      <div align="center" style="vertical-align: middle">
                        <i class="bi bi-film" style="font-size: 30"></i>
                        <br />조회 가능한 상영시간이 없습니다.<br />조건을
                        변경해주세요.
                      </div>
                    </td>
                  </tr>
                  <tr height="50%">
                    <td></td>
                  </tr>
                </table>
                <input
                  type="hidden"
                  id="sendTheater"
                  name="theaterNm"
                  value="1"
                />
                <input
                  type="hidden"
                  id="sendTime"
                  name="selectTime"
                  value="1"
                />
                <input type="hidden" id="sendTable" name="tableNm" value="1" />
              </div>
            </td>
          </tr>
          <tr>
            <td
              class="tg-0lax"
              align="center"
              height="12"
              style="background: slategray; color: lavender"
            >
              극장
            </td>
          </tr>
          <tr>
            <td class="tg-0lax" align="center">
              <!-- 도시선택 -->
              <select
                id="selectedCity"
                style="width: 50%"
                onchange="javascript:SelectCity()"
              >
                <option value="주소" selected>주소</option>
              </select>
              <input type="hidden" id="cityIdx" name="cityIdx" value="도시" />
              <input type="hidden" id="cityNm" name="cityNm" value="도시" />
            </td>
          </tr>
          <tr>
            <td class="tg-0lax" height="40%">
              <!-- 지점목록 -->
              <div style="height: 100%; width: 100%; overflow: auto">
                <table id="regionTable" width="100%">
                  <tr align="center" style="font-size: 20px">
                    <td style="background: lightgray">
                      <a
                        href="javascript:selectSection('1')"
                        class="noneUnderLine"
                        >상영관목록</a
                      >
                    </td>
                  </tr>
                </table>
                <input type="hidden" id="sendScNm" name="sectionNm" value="1" />
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </form>
  </div>
</body>
