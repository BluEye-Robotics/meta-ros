DESCRIPTION = "ROS driver for IBEO LUX"
AUTHOR = "Joe Kale"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp std-msgs ibeo-core pcl-ros geometry-msgs visualization-msgs network-interface ibeo-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/astuff/ibeo_lux-release/archive/release/melodic/ibeo_lux/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "db90c821cc1cd4efe85b4386a144daf2"
SRC_URI[sha256sum] = "0aa9797cbee3936a930074405e44de2f604c0eaf99b7b4e6b60d3773243a0fb3"

S = "${WORKDIR}/ibeo_lux-release-release-melodic-ibeo_lux-2.0.1-0"

inherit catkin
