DESCRIPTION = "hector_gazebo_plugins provides gazebo plugins from Team Hector. Currently it contains a 6wd differential drive plugin, an IMU sensor plugin, an earth magnetic field sensor plugin, a GPS sensor plugin and a sonar ranger plugin."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp gazebo-dev std-msgs std-srvs geometry-msgs nav-msgs tf dynamic-reconfigure message-generation roscpp gazebo gazebo-ros std-msgs std-srvs geometry-msgs nav-msgs tf dynamic-reconfigure message-runtime"

RDEPENDS_${PN} = "roscpp gazebo gazebo-ros std-msgs std-srvs geometry-msgs nav-msgs tf dynamic-reconfigure message-runtime"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/melodic/hector_gazebo_plugins/0.5.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0b20da090ba9d0695f2bf6983142f084"
SRC_URI[sha256sum] = "950bd57e9157767ab5699a7b93eee1083a484633b26f8931b433c71755716159"

ROS_SPN = "hector_gazebo"
S = "${WORKDIR}/hector_gazebo-release-release-melodic-hector_gazebo_plugins-0.5.1-0"

inherit catkin
