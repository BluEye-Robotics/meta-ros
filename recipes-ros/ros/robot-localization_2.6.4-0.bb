DESCRIPTION = "Provides nonlinear state estimation through sensor fusion of an abritrary number of sensors."
AUTHOR = "Tom Moore"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation python-catkin-pkg roslint cmake-modules diagnostic-msgs diagnostic-updater libeigen eigen-conversions geographic-msgs geometry-msgs message-filters nav-msgs nodelet roscpp sensor-msgs std-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros xmlrpcpp yaml-cpp"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/cra-ros-pkg/robot_localization-release/archive/release/melodic/robot_localization/2.6.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1258dedb1691b28db4d1569b783468ee"
SRC_URI[sha256sum] = "ec11a24842691aeb10996db5752bd1b2af596a93c2598793afc12075009cc22d"

S = "${WORKDIR}/robot_localization-release-release-melodic-robot_localization-2.6.4-0"

inherit catkin
