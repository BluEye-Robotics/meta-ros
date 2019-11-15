DESCRIPTION = "The OSG Works library adapted to UWSim. See https://code. google. com/p/osgworks"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost libopenscenegraph  catkin boost libopenscenegraph"

RDEPENDS_${PN} = "catkin boost libopenscenegraph"

SRC_URI = "https://github.com/uji-ros-pkg/uwsim_osgworks-release/archive/release/melodic/uwsim_osgworks/3.0.3-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "28d9ca4caa4dddfc727a2911bd13bf34"
SRC_URI[sha256sum] = "c1c8871ee6ee12995a6964a45f8a46d2a347e8c9871bec8d1e573850576e01d9"

S = "${WORKDIR}/uwsim_osgworks-release-release-melodic-uwsim_osgworks-3.0.3-2"

inherit catkin
