DESCRIPTION = "The OPT++ catkin wrapper package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "git gfortran autoconf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/optpp_catkin-release/archive/release/melodic/optpp_catkin/2.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "166ffdddd2f8f9693d4b921d77645431"
SRC_URI[sha256sum] = "b910ce830859bdd106d02f6cce840ffaa18ad3dd7cdf0e6b4f8d9da024137acf"

S = "${WORKDIR}/optpp_catkin-release-release-melodic-optpp_catkin-2.4.0-1"

inherit catkin
