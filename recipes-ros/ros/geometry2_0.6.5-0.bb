DESCRIPTION = "A metapackage to bring in the default packages second generation Transform Library in ros, tf2."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "tf2 tf2-bullet tf2-eigen tf2-geometry-msgs tf2-kdl tf2-msgs tf2-py tf2-ros tf2-sensor-msgs tf2-tools"

RDEPENDS_${PN} = "tf2 tf2-bullet tf2-eigen tf2-geometry-msgs tf2-kdl tf2-msgs tf2-py tf2-ros tf2-sensor-msgs tf2-tools"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/geometry2/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a1d00277305743ca87af2d69bd75ef79"
SRC_URI[sha256sum] = "077b18d3f1afdc72a99c3fb4e14168da26d82e4ae2e5b18ef90960e187209140"

S = "${WORKDIR}/geometry2-release-release-melodic-geometry2-0.6.5-0"

inherit catkin
