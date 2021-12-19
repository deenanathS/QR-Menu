docker run --name mytest -p 41061:22 -p 41062:80 -d -v ~/home/ritik/Downloads/QrEasy/qreasy:/www tomsik68/xampp:8
docker cp  /home/ritik/Downloads/QrEasy/qreasy mytest:/opt/lampp/htdocs
