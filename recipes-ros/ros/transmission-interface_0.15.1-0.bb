DESCRIPTION = "Transmission Interface."
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hardware-interface cmake-modules libtinyxml roscpp pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/transmission_interface/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "13b38c2f21acf1c0fe7e48eaff7d6928"
SRC_URI[sha256sum] = "6b28074919478b6422588385850f0450d788ad06829adca29ae5cf2cac798692"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-transmission_interface-0.15.1-0"

inherit catkin
