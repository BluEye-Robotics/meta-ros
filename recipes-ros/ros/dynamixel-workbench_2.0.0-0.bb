DESCRIPTION = "Dynamixel-Workbench is dynamixel solution for ROS. This metapackage allows you to easily change the ID, baudrate and operating mode of the Dynamixel. Furthermore, it supports various controllers based on operating mode and Dynamixel SDK. These controllers are commanded by operators."
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "dynamixel-workbench-controllers dynamixel-workbench-operators dynamixel-workbench-single-manager dynamixel-workbench-single-manager-gui dynamixel-workbench-toolbox"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/melodic/dynamixel_workbench/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "877cad9b331db90c21683c53d54db436"
SRC_URI[sha256sum] = "00841253629ace29288f09f2eaeedc1d86eee69657d4b0ac32824b4561f5d574"

ROS_SPN = "dynamixel-workbench"
S = "${WORKDIR}/dynamixel-workbench-release-release-melodic-dynamixel_workbench-2.0.0-0"

inherit catkin
