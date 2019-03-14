DESCRIPTION = "The mbf_simple_nav package contains a simple navigation server implementation of Move Base Flex (MBF). The simple navigation server is bound to no map representation. It provides actions for planning, controlling and recovering. MBF loads all defined plugins which are defined in the lists *planners*, *controllers* and *recovery_behaviors*. Each list holds a pair of a *name* and a *type*. The *type* defines which kind of plugin to load. The *name* defines under which name the plugin should be callable by the actions. It tries to load the defined plugins which implements the defined interfaces in"
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2a17ba6bda1db7ca47fe93a1560e517b"

DEPENDS = "tf roscpp pluginlib actionlib actionlib-msgs dynamic-reconfigure std-msgs std-srvs nav-msgs geometry-msgs mbf-abstract-nav mbf-abstract-core mbf-msgs tf2 tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_simple_nav/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "85ff654817a99ed6069c2c5bd0b7392f"
SRC_URI[sha256sum] = "29ab5a2e9938d504135251b3d5aef505d7f67cec5428c96afa6d9abdf3ed532b"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_simple_nav-0.2.3-0"

inherit catkin
