DESCRIPTION = "Motion limiter package for collision prevention"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl roscpp diagnostic-updater geometry-msgs pcl-conversions sensor-msgs std-msgs tf2-ros tf2-sensor-msgs neonavigation-common cmake-modules libeigen xmlrpcpp"

RDEPENDS_${PN} = "libpcl-all"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/safety_limiter/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "95e936be649ebc1b0db9fe9fffa977f5"
SRC_URI[sha256sum] = "b9652469d6389a515c2bf5827dc1d0464253071661b5c11fa1a6127ad9df9772"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-safety_limiter-0.4.3-1"

inherit catkin
