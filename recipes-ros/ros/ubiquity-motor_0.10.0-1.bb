DESCRIPTION = "Provides a ROS interface to Ubiquity Robotics Magni motor controllers"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs std-msgs tf nav-msgs serial hardware-interface controller-manager dynamic-reconfigure diagnostic-updater"

RDEPENDS_${PN} = "diff-drive-controller joint-state-controller python-requests"

SRC_URI = "https://github.com/UbiquityRobotics-release/ubiquity_motor-release/archive/release/melodic/ubiquity_motor/0.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3c5ad8ce679150f51d6b90a74d687df1"
SRC_URI[sha256sum] = "fc7f93bc91f0b0839504df0bcec459794df081b9dfb9fe6bad99c747bb55f0bb"

S = "${WORKDIR}/ubiquity_motor-release-release-melodic-ubiquity_motor-0.10.0-1"

inherit catkin
