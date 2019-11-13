DESCRIPTION = "Reactive navigation for 2D robots using MRPT navigation algorithms (TP-Space)"
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 actionlib actionlib-msgs dynamic-reconfigure geometry-msgs mrpt-bridge roscpp tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_reactivenav2d/0.1.26-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a7d7ce478f15ecbe09e384e7b504245"
SRC_URI[sha256sum] = "6c7352f0b6f9eda20e956b30797e10bb40b0aa1ba0a22be33a872f5d3a2eb47a"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_reactivenav2d-0.1.26-1"

inherit catkin
