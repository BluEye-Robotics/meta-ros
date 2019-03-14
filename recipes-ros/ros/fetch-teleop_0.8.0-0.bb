DESCRIPTION = "Teleoperation for fetch and freight."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib control-msgs geometry-msgs nav-msgs roscpp sensor-msgs topic-tools"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_teleop/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2430f1699b7bb6f850f85c9f5a036083"
SRC_URI[sha256sum] = "1e6d65aa8aabe6fe4d77e22c7443c985a76e0092c8513da6192dd330e0862765"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_teleop-0.8.0-0"

inherit catkin
