DESCRIPTION = "multisense catkin driver"
AUTHOR = "Maintained by CarnegieRobotics LLC"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "multisense-description multisense-bringup multisense-ros multisense-lib multisense-cal-check"

RDEPENDS_${PN} = "multisense-description multisense-bringup multisense-ros multisense-lib multisense-cal-check"

SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense/4.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "17f4abf9cdf37d0aff0f2adf8bc1d2cf"
SRC_URI[sha256sum] = "f35a0adbc07dc268fb0740de110b3c45e472843b6dbd90cbd98ae02a867b7f81"

ROS_SPN = "multisense_ros"
S = "${WORKDIR}/multisense_ros-release-release-melodic-multisense-4.0.2-0"

inherit catkin
