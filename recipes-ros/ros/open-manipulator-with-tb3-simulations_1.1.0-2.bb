DESCRIPTION = "Simulation packages for OpenManipulator with TurtleBot3"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "open-manipulator-with-tb3-gazebo"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_with_tb3_simulations-release/archive/release/melodic/open_manipulator_with_tb3_simulations/1.1.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d91a8170a8944d2214135d60c2e6fe93"
SRC_URI[sha256sum] = "efe76d391f38587da7c22cdd2d53fe308be8fc7ef3b59e24a231b7df5ee3b2f6"

S = "${WORKDIR}/open_manipulator_with_tb3_simulations-release-release-melodic-open_manipulator_with_tb3_simulations-1.1.0-2"

inherit catkin
