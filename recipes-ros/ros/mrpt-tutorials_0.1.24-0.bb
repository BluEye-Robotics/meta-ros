DESCRIPTION = "Example files used as tutorials for MRPT ROS packages"
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "teleop-twist-keyboard tf"

RDEPENDS_${PN} = "teleop-twist-keyboard tf"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_tutorials/0.1.24-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3251a200cc9268d478d3b2f18f4b7e78"
SRC_URI[sha256sum] = "c5e608015e00a03be1ea0aa3a86e91cab4da37a2ec842f915eaaa2a8930c3e8b"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_tutorials-0.1.24-0"

inherit catkin
