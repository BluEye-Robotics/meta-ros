SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bf5f46e5e78fb0b2062690601a670d14"
SRC_URI[sha256sum] = "3bd1db7312cf25ac36ea2161c4ccab8d11e7a8e1d444680a6f231ee33f07b2cc"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "collada_urdf"
