DESCRIPTION = "rospilot"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "sensor-msgs geometry-msgs std-msgs std-srvs message-generation roslint libgphoto-dev roscpp ffmpeg libturbojpeg libnl-3-dev libmicrohttpd opencv vision-opencv libnl-3 rosbash dnsmasq hostapd rospy mavlink message-runtime sensor-msgs geometry-msgs std-msgs std-srvs rosbridge-suite python-pyserial python-cherrypy python-psutil python-colorama roslaunch python-mapnik python-tilestache mapnik-utils gdal-bin osm2pgsql postgresql-postgis curl unzip wget"

RDEPENDS_${PN} = "vision-opencv libnl-3 rosbash dnsmasq hostapd rospy mavlink message-runtime sensor-msgs geometry-msgs std-msgs std-srvs rosbridge-suite python-pyserial python-cherrypy python-psutil python-colorama roslaunch python-mapnik python-tilestache mapnik-utils gdal-bin osm2pgsql postgresql-postgis curl unzip wget"

SRC_URI = "https://github.com/rospilot/rospilot-release/archive/release/melodic/rospilot/1.5.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0d767ddb7a37ed1e0ee262f43cfd14ac"
SRC_URI[sha256sum] = "3e393fbfff16e69384d1a4d186439df31ff3667f3062c0b6fc28cebc4a689ee8"

S = "${WORKDIR}/rospilot-release-release-melodic-rospilot-1.5.6-0"

inherit catkin
