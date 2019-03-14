DESCRIPTION = "Gazebo plugin to provide simulated data from Velodyne laser scanners."
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs tf gazebo-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/velodyne_simulator-release/archive/release/melodic/velodyne_gazebo_plugins/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8f570c94b34b4555f0fd5ef08dfd31ee"
SRC_URI[sha256sum] = "894c7ae31607b6f889b86f2ab0d7c13d0d40c291fb09c73c93f394b96b73cf72"

ROS_SPN = "velodyne_simulator"
S = "${WORKDIR}/velodyne_simulator-release-release-melodic-velodyne_gazebo_plugins-1.0.9-0"

inherit catkin
