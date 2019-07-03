DESCRIPTION = "Reactive navigation for 2D robots using MRPT navigation algorithms (TP-Space)"
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 actionlib actionlib-msgs dynamic-reconfigure geometry-msgs mrpt-bridge roscpp tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_reactivenav2d/0.1.24-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "68b4bba159c28f72176b210c551463af"
SRC_URI[sha256sum] = "9ed18349bd87a33282aebd32c8a56faae62fe5bbb19330f3ba29ffd6c8d2cf31"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_reactivenav2d-0.1.24-0"

inherit catkin
