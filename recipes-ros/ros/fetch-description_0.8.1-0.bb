DESCRIPTION = "URDF for Fetch Robot."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "CC-BY-NC-ND-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=6549234dc4c73b62e8ba710cb6e68a29"

DEPENDS = ""

RDEPENDS_${PN} = "urdf xacro"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_description/0.8.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5a9369a4e2ee2d2ba92b3af637ab0def"
SRC_URI[sha256sum] = "5cb7bb5e9f9f1eefc1f99d5c5375ebbeef60d10d62ed7d02478be238d9969087"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_description-0.8.1-0"

inherit catkin
