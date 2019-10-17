DESCRIPTION = "Example files used as tutorials for MRPT ROS packages"
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "teleop-twist-keyboard tf"

RDEPENDS_${PN} = "teleop-twist-keyboard tf"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_tutorials/0.1.26-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2eb7ad1c7a6eff6908d5e842a97c76aa"
SRC_URI[sha256sum] = "056e0a6b2e6f66f064975a5d8df023325bc86ac013f6ed4d179b82a3ff369619"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_tutorials-0.1.26-1"

inherit catkin
