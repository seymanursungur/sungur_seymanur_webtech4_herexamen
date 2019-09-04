from django.conf.urls import path
from . import  views

urlpatterns = [
    path('<int:number_of_speed>/', views.detail, name='detail'),
]