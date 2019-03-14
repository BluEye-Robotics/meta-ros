DESCRIPTION = "URDF for Fetch Robot."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "CC-BY-NC-ND-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=6549234dc4c73b62e8ba710cb6e68a29"

DEPENDS = ""

RDEPENDS_${PN} = "urdf xacro"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_description/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fcfd7289d801061f0c3401f74f2bd7c0"
SRC_URI[sha256sum] = "294457fdfa978c7aea534269a5783a034da229e6cb362f228c943b3de2036d4d"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_description-0.8.0-0"

inherit catkin
