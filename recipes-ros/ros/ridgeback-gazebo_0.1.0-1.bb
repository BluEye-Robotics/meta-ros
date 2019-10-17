DESCRIPTION = "Launchfiles to use Ridgeback in Gazebo."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch gazebo-ros gazebo-ros-control gazebo-plugins hector-gazebo-plugins ridgeback-gazebo-plugins ridgeback-control ridgeback-description"

RDEPENDS_${PN} = "gazebo-ros gazebo-ros-control gazebo-plugins hector-gazebo-plugins ridgeback-gazebo-plugins ridgeback-control ridgeback-description"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback_simulator-release/archive/release/melodic/ridgeback_gazebo/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3ffb78213d146415797d1ee7a6e55cf2"
SRC_URI[sha256sum] = "566ee423e7937ce8e5d92f7d12151a0fe4d5b11aa903d5d738522a65ac1ccb0c"

ROS_SPN = "ridgeback_simulator"
S = "${WORKDIR}/ridgeback_simulator-release-release-melodic-ridgeback_gazebo-0.1.0-1"

inherit catkin
