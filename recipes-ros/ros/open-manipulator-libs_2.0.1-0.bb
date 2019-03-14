DESCRIPTION = "OpenManipulator library (Kinematics lib. , Dynamixel lib. , Drawing path lib. )"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp robotis-manipulator dynamixel-workbench-toolbox cmake-modules libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator_libs/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "011a00c6ae58c820e9bfd19adc10d670"
SRC_URI[sha256sum] = "1e026abdb7af7fe42518d35f418754921f3231a328794e8eba9d10ab1bea3b63"

ROS_SPN = "open_manipulator"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator_libs-2.0.1-0"

inherit catkin
