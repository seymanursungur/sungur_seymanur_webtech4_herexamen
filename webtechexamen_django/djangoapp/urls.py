from django.urls import path
from . import views


urlpatterns = [
    path('',views.getJSON, name='getJSON'),
   # path('<int:number_of_speed>/', views.detail, name='detail'),
]