DESCRIPTION = "Reactive navigation for 2D robots using MRPT navigation algorithms (TP-Space)"
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 actionlib actionlib-msgs dynamic-reconfigure geometry-msgs mrpt-bridge roscpp tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_reactivenav2d/0.1.22-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "732bcf09e69c7ff8b3ccd0250808729c"
SRC_URI[sha256sum] = "808b2bf5865060d35c80defc9bcc8976135f4ff2e8d54c4528aae759062a8e55"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_reactivenav2d-0.1.22-0"

inherit catkin
