DESCRIPTION = "Example files used as tutorials for MRPT ROS packages"
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "teleop-twist-keyboard tf"

RDEPENDS_${PN} = "teleop-twist-keyboard tf"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_tutorials/0.1.22-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2549020accf30a93b6fabf3dca001264"
SRC_URI[sha256sum] = "d44d72519b395146b2209b8842f4bd4708cac69a6b29b1f3475e7286188bd589"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_tutorials-0.1.22-0"

inherit catkin
