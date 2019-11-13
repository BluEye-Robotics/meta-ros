DESCRIPTION = "The OSG Bullet library adapted to UWSim. See https://code. google. com/p/osgbullet"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost libopenscenegraph uwsim-bullet uwsim-osgworks catkin boost libopenscenegraph uwsim-bullet uwsim-osgworks"

RDEPENDS_${PN} = "catkin boost libopenscenegraph uwsim-bullet uwsim-osgworks"

SRC_URI = "https://github.com/uji-ros-pkg/uwsim_osgbullet-release/archive/release/melodic/uwsim_osgbullet/3.0.1-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5d5f35114bb9408d72f3811a20ad3ffa"
SRC_URI[sha256sum] = "02837902799dfbced008ccff28abccb0b7115e2c3efeb2733496e2246a031582"

S = "${WORKDIR}/uwsim_osgbullet-release-release-melodic-uwsim_osgbullet-3.0.1-3"

inherit catkin
