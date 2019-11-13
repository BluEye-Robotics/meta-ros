DESCRIPTION = "The OSG Ocean library adapted to UWSim. See https://code. google. com/p/osgocean"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost libopenscenegraph libfftw3  catkin boost libopenscenegraph libfftw3"

RDEPENDS_${PN} = "catkin boost libopenscenegraph libfftw3"

SRC_URI = "https://github.com/uji-ros-pkg/uwsim_osgocean-release/archive/release/melodic/uwsim_osgocean/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9235f13ce0b31075836115e504062456"
SRC_URI[sha256sum] = "f1fa072efeefdae435dbad0e4e11364da90dd778018d0c83b5d183a0fe587cc4"

S = "${WORKDIR}/uwsim_osgocean-release-release-melodic-uwsim_osgocean-1.0.4-1"

inherit catkin
