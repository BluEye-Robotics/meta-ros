DESCRIPTION = "Bindings and low-level controllers for ArbotiX-powered robots."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy tf arbotix-msgs sensor-msgs geometry-msgs diagnostic-msgs control-msgs nav-msgs actionlib python3-pyserial"

RDEPENDS_${PN} = "rospy tf arbotix-msgs sensor-msgs geometry-msgs diagnostic-msgs control-msgs nav-msgs actionlib python3-pyserial"

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix_python/0.10.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e80930a781d1d4766aa1b585a0c44d2d"
SRC_URI[sha256sum] = "cef79742fd412330d7bf8982775ca8aac8ddc936b1ebe0744ac07a47375a5469"

ROS_SPN = "arbotix"
S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix_python-0.10.0-0"

inherit catkin
