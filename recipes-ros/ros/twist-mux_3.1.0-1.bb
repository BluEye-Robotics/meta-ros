DESCRIPTION = "Twist multiplexer, which multiplex several velocity commands (topics) and allows to priorize or disable them (locks)."
AUTHOR = "Enrique Fernandez"
SECTION = "devel"
LICENSE = "CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=6bc0e2b80b41b84c8240cea714dea709"

DEPENDS = "roscpp std-msgs geometry-msgs visualization-msgs diagnostic-updater rostest roscpp std-msgs geometry-msgs visualization-msgs twist-mux-msgs diagnostic-updater"

RDEPENDS_${PN} = "roscpp std-msgs geometry-msgs visualization-msgs twist-mux-msgs diagnostic-updater"

SRC_URI = "https://github.com/ros-gbp/twist_mux-release/archive/release/melodic/twist_mux/3.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "440e8cd435fbaaa5c9ebc31265b244de"
SRC_URI[sha256sum] = "aa2888069d0ed77dbab6759a450cef52d03b6f64b09514c006bd2f49384732bd"

S = "${WORKDIR}/twist_mux-release-release-melodic-twist_mux-3.1.0-1"

inherit catkin
