<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
            <title>부트스트랩 템플릿</title>
        
            <!-- 부트스트랩 css-->
            <link href="css/bootstrap.min.css" rel="stylesheet">
        
            <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
            <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
            <!--[if lt IE 9]>
              <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
              <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
            <![endif]-->
        </head>
        <script>
            const initForUser = () => {
                fetch("/api/store/card", {
                    method: "GET",
                })
                    .then((res) => res.json())
                    .then((result) => {
                        console.log(result);

                        const storeList = result.data.storeList.filter(
                            (product) => product.status == 1
                        );
                        const cardList = document.querySelector("#test");
                        for (const product of storeList) {
                            if (product.status == 1)
                                cardList.insertAdjacentHTML(
                                    "beforeend",
                                    `
			        <div class="card" style="width: 18rem;">
						<div class="product text-center" style="height: 200px">

							<form method="post" id="proInfo">
								<a class="open-productDetail nav-link mx-auto"
									style="width: 16rem; height: 16rem;"
									onclick="productUpdate(`+ product.idx + `)">
									<figure>
										<img class="embed-responsive-item" id="productImg<%%>"
											src="`+ product.image + `"
											style="width: 200px; height: 200px;">
										<figcaption>
											<i class="bi bi-pencil-square fs-3"></i> <input type="hidden"
												name="productNo" id="productNo" value="`+ product.idx + `" />
										</figcaption>
									</figure>
								</a>
							</form>
						</div>
						<div class="col p-4 d-flex flex-column position-static">
							<div class="mb-1 text-body-secondary text-center"
								style="font-size: 20px;">`+ product.name + `</div>
							<p class="card-text mb-auto text-center" style="font-size: 20px;">`+ product.detail + `</p>
							<p class="card-text mb-auto text-center" style="font-size: 20px;">`+ product.price + ` 원</p>
						</div>
					</div>
        `
                                );
                        }
                    })
                    .catch((error) => {
                        console.log(error);
                        alert("에러가 발생했습니다.");
                    });
            };


            

            initForUser();
        </script>

        <body>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
                crossorigin="anonymous"></script>

            <div class="container-lg">
                <img src="https://ifh.cc/g/C9B70Z.jpg" class="product-img img-fluid mx-auto d-block " alt="...">
                <div class="nav-scroller py-1 mb-2" id="list-example">
                    <nav class="nav d-flex justify-content-around">
                        <a class="nav-link p-2 link-secondary" href="#best">
                            <h4>베스트</h4>
                        </a>
                        <c:forEach items="${categoryDto.categoryList}" var="categoryItem" varStatus="loop">
                            <a class="nav-link p-2 link-secondary" href="#store<c:out value="${loop.index}"/>">
                            <h4>${categoryItem.category}</h4>
                            </a>
                        </c:forEach>
                        <a class="nav-link p-2 link-secondary" href="cart.jsp">
                            <h4>장바구니</h4>
                        </a>
                        <a class="nav-link p-2 link-secondary" href="javascript:productInsert()">
                            <h4><i class="bi bi-plus-circle"></i>&nbsp;관리</h4>
                        </a>
                    </nav>
                </div>

                <div class="row row-cols-1 rofw-cols-xs-3 g-4" style="padding-left: 30px; padding-top: 20px" id="test">
                    <!-- 카드 생성 부분 -->
                    
                </div>
            </div>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
        </body>

        </html>