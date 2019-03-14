DESCRIPTION = "Holds maps of Willow Garage that can be used for a number of different applications."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/willow_maps-release/archive/release/melodic/willow_maps/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec8bb71652a113ef314f88aef265ad85"
SRC_URI[sha256sum] = "8c9dbbaeabb4464c98637228bddfd69f2b0e8692e40d9a0f0921b4b910e0dfe9"

S = "${WORKDIR}/willow_maps-release-release-melodic-willow_maps-1.0.3-0"

inherit catkin
